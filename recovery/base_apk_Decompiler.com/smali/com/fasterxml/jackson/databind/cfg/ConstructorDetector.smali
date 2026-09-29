###### Class com.fasterxml.jackson.databind.cfg.ConstructorDetector (com.fasterxml.jackson.databind.cfg.ConstructorDetector)
.class public final Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

.field public static final EXPLICIT_ONLY:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

.field public static final USE_DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

.field public static final USE_PROPERTIES_BASED:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;


# instance fields
.field protected final _allowJDKTypeCtors:Z

.field protected final _requireCtorAnnotation:Z

.field protected final _singleArgMode:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 80
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->HEURISTIC:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;-><init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->DEFAULT:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    .line 87
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;-><init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->USE_PROPERTIES_BASED:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    .line 94
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;-><init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->USE_DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    .line 101
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->REQUIRE_MODE:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;-><init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->EXPLICIT_ONLY:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;)V
    .registers 3

    const/4 v0, 0x0

    .line 145
    invoke-direct {p0, p1, v0, v0}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;-><init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;ZZ)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;ZZ)V
    .registers 4

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_singleArgMode:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    .line 136
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_requireCtorAnnotation:Z

    .line 137
    iput-boolean p3, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_allowJDKTypeCtors:Z

    return-void
.end method


# virtual methods
.method public final requireCtorAnnotation()Z
    .registers 1

    .line 174
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_requireCtorAnnotation:Z

    return p0
.end method

.method public final shouldIntrospectorImplicitConstructors(Ljava/lang/Class;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 201
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_requireCtorAnnotation:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return v1

    .line 205
    :cond_6
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_allowJDKTypeCtors:Z

    if-nez p0, :cond_19

    .line 206
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isJDKClass(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_19

    .line 210
    const-class p0, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_19

    return v1

    :cond_19
    const/4 p0, 0x1

    return p0
.end method

.method public final singleArgCreatorDefaultsToDelegating()Z
    .registers 2

    .line 182
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_singleArgMode:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    if-ne p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final singleArgCreatorDefaultsToProperties()Z
    .registers 2

    .line 186
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_singleArgMode:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    if-ne p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final singleArgMode()Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;
    .registers 1

    .line 170
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;->_singleArgMode:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor (com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor)
.class public final enum Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SingleArgConstructor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

.field public static final enum DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

.field public static final enum HEURISTIC:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

.field public static final enum PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

.field public static final enum REQUIRE_MODE:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;


# direct methods
.method static constructor <clinit>()V
    .registers 6

    .line 38
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    const-string v1, "DELEGATING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->DELEGATING:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    .line 43
    new-instance v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    const-string v2, "PROPERTIES"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    .line 51
    new-instance v2, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    const-string v3, "HEURISTIC"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->HEURISTIC:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    .line 58
    new-instance v3, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    const-string v4, "REQUIRE_MODE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->REQUIRE_MODE:Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    .line 34
    filled-new-array {v0, v1, v2, v3}, [Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;
    .registers 2

    .line 34
    const-class v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;
    .registers 1

    .line 34
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/cfg/ConstructorDetector$SingleArgConstructor;

    return-object v0
.end method
