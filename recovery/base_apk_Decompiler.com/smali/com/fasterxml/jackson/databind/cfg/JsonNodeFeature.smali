###### Class com.fasterxml.jackson.databind.cfg.JsonNodeFeature (com.fasterxml.jackson.databind.cfg.JsonNodeFeature)
.class public final enum Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;",
        ">;",
        "Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

.field public static final enum READ_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

.field public static final enum STRIP_TRAILING_BIGDECIMAL_ZEROES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

.field public static final enum WRITE_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;


# instance fields
.field private final _enabledByDefault:Z

.field private final _mask:I


# direct methods
.method static constructor <clinit>()V
    .registers 6

    .line 20
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    const-string v1, "READ_NULL_PROPERTIES"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->READ_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    .line 28
    new-instance v1, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    const-string v2, "WRITE_NULL_PROPERTIES"

    invoke-direct {v1, v2, v3, v3}, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->WRITE_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    .line 51
    new-instance v2, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    const-string v4, "STRIP_TRAILING_BIGDECIMAL_ZEROES"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->STRIP_TRAILING_BIGDECIMAL_ZEROES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    iput-boolean p3, p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->_enabledByDefault:Z

    const/4 p1, 0x1

    .line 65
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    shl-int/2addr p1, p2

    iput p1, p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->_mask:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;
    .registers 2

    .line 9
    const-class v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;
    .registers 1

    .line 9
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    return-object v0
.end method


# virtual methods
.method public final enabledByDefault()Z
    .registers 1

    .line 69
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->_enabledByDefault:Z

    return p0
.end method

.method public final enabledIn(I)Z
    .registers 2

    .line 71
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->_mask:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final featureIndex()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final getMask()I
    .registers 1

    .line 73
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->_mask:I

    return p0
.end method
