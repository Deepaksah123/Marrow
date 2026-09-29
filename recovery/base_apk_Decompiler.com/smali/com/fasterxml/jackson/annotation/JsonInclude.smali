###### Class com.fasterxml.jackson.annotation.JsonInclude (com.fasterxml.jackson.annotation.JsonInclude)
.class public interface abstract annotation Lcom/fasterxml/jackson/annotation/JsonInclude;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/annotation/JsonInclude;
        content = .enum Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->ALWAYS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
        contentFilter = Ljava/lang/Void;
        value = .enum Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->ALWAYS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
        valueFilter = Ljava/lang/Void;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/annotation/JsonInclude$Include;,
        Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract content()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
.end method

.method public abstract contentFilter()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract value()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
.end method

.method public abstract valueFilter()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

###### Class com.fasterxml.jackson.annotation.JsonInclude.Include (com.fasterxml.jackson.annotation.JsonInclude$Include)
.class public final enum Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonInclude;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Include"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/annotation/JsonInclude$Include;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum ALWAYS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum CUSTOM:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum NON_ABSENT:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum NON_DEFAULT:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum NON_EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum NON_NULL:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field public static final enum USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;


# direct methods
.method static constructor <clinit>()V
    .registers 9

    .line 119
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v1, "ALWAYS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->ALWAYS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 125
    new-instance v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v2, "NON_NULL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_NULL:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 140
    new-instance v2, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v3, "NON_ABSENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_ABSENT:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 187
    new-instance v3, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v4, "NON_EMPTY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 210
    new-instance v4, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v5, "NON_DEFAULT"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_DEFAULT:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 228
    new-instance v5, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v6, "CUSTOM"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->CUSTOM:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 239
    new-instance v6, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const-string v7, "USE_DEFAULTS"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 113
    filled-new-array/range {v0 .. v6}, [Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->$VALUES:[Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 113
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
    .registers 2

    .line 113
    const-class v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
    .registers 1

    .line 113
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->$VALUES:[Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    return-object v0
.end method

###### Class com.fasterxml.jackson.annotation.JsonInclude.Value (com.fasterxml.jackson.annotation.JsonInclude$Value)
.class public Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonInclude;
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
.field protected static final EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;


# instance fields
.field protected final _contentFilter:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

.field protected final _valueFilter:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 261
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2, v2}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Include;",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Include;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_7

    .line 284
    sget-object p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    :cond_7
    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-nez p2, :cond_d

    .line 285
    sget-object p2, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    :cond_d
    iput-object p2, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 286
    const-class p1, Ljava/lang/Void;

    const/4 p2, 0x0

    if-ne p3, p1, :cond_15

    move-object p3, p2

    :cond_15
    iput-object p3, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    .line 287
    const-class p1, Ljava/lang/Void;

    if-ne p4, p1, :cond_1c

    move-object p4, p2

    :cond_1c
    iput-object p4, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    return-void
.end method

.method public static construct(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 4

    .line 373
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq p0, v0, :cond_6

    if-nez p0, :cond_c

    :cond_6
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq p1, v0, :cond_13

    if-eqz p1, :cond_13

    .line 377
    :cond_c
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    .line 375
    :cond_13
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0
.end method

.method public static construct(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Include;",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Include;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    .line 388
    const-class v0, Ljava/lang/Void;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_6

    move-object p2, v1

    .line 391
    :cond_6
    const-class v0, Ljava/lang/Void;

    if-ne p3, v0, :cond_b

    move-object p3, v1

    .line 394
    :cond_b
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq p0, v0, :cond_11

    if-nez p0, :cond_1e

    :cond_11
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq p1, v0, :cond_17

    if-nez p1, :cond_1e

    :cond_17
    if-nez p2, :cond_1e

    if-nez p3, :cond_1e

    .line 399
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0

    .line 401
    :cond_1e
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static empty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 1

    .line 291
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object v0
.end method

.method public static from(Lcom/fasterxml/jackson/annotation/JsonInclude;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 6

    if-nez p0, :cond_5

    .line 410
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0

    .line 412
    :cond_5
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonInclude;->value()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    move-result-object v0

    .line 413
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonInclude;->content()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    move-result-object v1

    .line 415
    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v0, v2, :cond_18

    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v1, v2, :cond_18

    .line 416
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0

    .line 418
    :cond_18
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonInclude;->valueFilter()Ljava/lang/Class;

    move-result-object v2

    .line 419
    const-class v3, Ljava/lang/Void;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_22

    move-object v2, v4

    .line 422
    :cond_22
    invoke-interface {p0}, Lcom/fasterxml/jackson/annotation/JsonInclude;->contentFilter()Ljava/lang/Class;

    move-result-object p0

    .line 423
    const-class v3, Ljava/lang/Void;

    if-ne p0, v3, :cond_2b

    goto :goto_2c

    :cond_2b
    move-object v4, p0

    .line 426
    :goto_2c
    new-instance p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    invoke-direct {p0, v0, v1, v2, v4}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object p0
.end method

.method public static merge(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 2

    if-nez p0, :cond_3

    return-object p1

    .line 308
    :cond_3
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public static varargs mergeAll([Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 5

    .line 317
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_14

    aget-object v3, p0, v2

    if-eqz v3, :cond_11

    if-nez v1, :cond_c

    goto :goto_10

    .line 319
    :cond_c
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object v3

    :goto_10
    move-object v1, v3

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_14
    return-object v1
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

    .line 532
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_13

    return v1

    .line 533
    :cond_13
    check-cast p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    .line 535
    iget-object v2, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v2, v3, :cond_2e

    iget-object v2, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v2, v3, :cond_2e

    iget-object v2, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    if-ne v2, v3, :cond_2e

    iget-object p1, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    if-ne p1, p0, :cond_2e

    return v0

    :cond_2e
    return v1
.end method

.method public getContentFilter()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 503
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    return-object p0
.end method

.method public getContentInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
    .registers 1

    .line 495
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    return-object p0
.end method

.method public getValueFilter()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 499
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    return-object p0
.end method

.method public getValueInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Include;
    .registers 1

    .line 491
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    return-object p0
.end method

.method public hashCode()I
    .registers 2

    .line 524
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    shl-int/lit8 v0, v0, 0x2

    .line 525
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 3

    .line 327
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v0, v1, :cond_16

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne v0, v1, :cond_16

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    if-nez v0, :cond_16

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    if-nez v0, :cond_16

    .line 332
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    :cond_16
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 509
    const-string v1, "JsonInclude.Value(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 511
    const-string v1, ",content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 512
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 513
    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    const-string v2, ".class"

    if-eqz v1, :cond_32

    .line 514
    const-string v1, ",valueFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    :cond_32
    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    if-eqz v1, :cond_47

    .line 517
    const-string v1, ",contentFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_47
    const/16 p0, 0x29

    .line 519
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public withContentFilter(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    if-eqz p1, :cond_9

    .line 471
    const-class v0, Ljava/lang/Void;

    if-eq p1, v0, :cond_9

    .line 475
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->CUSTOM:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    goto :goto_c

    .line 472
    :cond_9
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const/4 p1, 0x0

    .line 477
    :goto_c
    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    invoke-static {v1, v0, p0, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->construct(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public withContentInclusion(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 5

    .line 481
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne p1, v0, :cond_5

    return-object p0

    :cond_5
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    invoke-direct {v0, v1, p1, v2, p0}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 10

    if-eqz p1, :cond_55

    .line 344
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->EMPTY:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    if-eq p1, v0, :cond_55

    .line 347
    iget-object v0, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 348
    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    .line 349
    iget-object v2, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    .line 350
    iget-object p1, p1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    .line 352
    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v0, v3, :cond_1a

    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq v0, v3, :cond_1a

    move v3, v5

    goto :goto_1b

    :cond_1a
    move v3, v4

    .line 353
    :goto_1b
    iget-object v6, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq v1, v6, :cond_25

    sget-object v6, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->USE_DEFAULTS:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-eq v1, v6, :cond_25

    move v6, v5

    goto :goto_26

    :cond_25
    move v6, v4

    .line 354
    :goto_26
    iget-object v7, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    if-ne v2, v7, :cond_2c

    if-eq p1, v7, :cond_2d

    :cond_2c
    move v4, v5

    :cond_2d
    if-eqz v3, :cond_3f

    if-eqz v6, :cond_37

    .line 358
    new-instance p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object p0

    .line 360
    :cond_37
    new-instance v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-direct {v1, v0, p0, v2, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_3f
    if-eqz v6, :cond_49

    .line 362
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    :cond_49
    if-eqz v4, :cond_55

    .line 364
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-direct {v0, v1, p0, v2, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    :cond_55
    return-object p0
.end method

.method public withValueInclusion(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 5

    .line 430
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    if-ne p1, v0, :cond_5

    return-object p0

    :cond_5
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_valueFilter:Ljava/lang/Class;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->_contentFilter:Ljava/lang/Class;

    invoke-direct {v0, p1, v1, v2, p0}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Lcom/fasterxml/jackson/annotation/JsonInclude$Include;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method
