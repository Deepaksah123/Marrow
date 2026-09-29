###### Class com.fasterxml.jackson.databind.cfg.EnumFeature (com.fasterxml.jackson.databind.cfg.EnumFeature)
.class public final enum Lcom/fasterxml/jackson/databind/cfg/EnumFeature;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/cfg/EnumFeature;",
        ">;",
        "Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

.field public static final enum READ_ENUM_KEYS_USING_INDEX:Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

.field public static final enum WRITE_ENUMS_TO_LOWERCASE:Lcom/fasterxml/jackson/databind/cfg/EnumFeature;


# instance fields
.field private final _enabledByDefault:Z

.field private final _mask:I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 25
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    const-string v1, "READ_ENUM_KEYS_USING_INDEX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->READ_ENUM_KEYS_USING_INDEX:Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    .line 39
    new-instance v1, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    const-string v3, "WRITE_ENUMS_TO_LOWERCASE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->WRITE_ENUMS_TO_LOWERCASE:Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    .line 11
    filled-new-array {v0, v1}, [Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 51
    iput-boolean p3, p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->_enabledByDefault:Z

    const/4 p1, 0x1

    .line 52
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    shl-int/2addr p1, p2

    iput p1, p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->_mask:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/EnumFeature;
    .registers 2

    .line 11
    const-class v0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/cfg/EnumFeature;
    .registers 1

    .line 11
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->$VALUES:[Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    return-object v0
.end method


# virtual methods
.method public final enabledByDefault()Z
    .registers 1

    .line 56
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->_enabledByDefault:Z

    return p0
.end method

.method public final enabledIn(I)Z
    .registers 2

    .line 58
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->_mask:I

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

    const/4 p0, 0x0

    return p0
.end method

.method public final getMask()I
    .registers 1

    .line 60
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->_mask:I

    return p0
.end method
