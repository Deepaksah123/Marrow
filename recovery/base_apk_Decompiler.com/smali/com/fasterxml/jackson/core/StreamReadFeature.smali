###### Class com.fasterxml.jackson.core.StreamReadFeature (com.fasterxml.jackson.core.StreamReadFeature)
.class public final enum Lcom/fasterxml/jackson/core/StreamReadFeature;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/core/util/JacksonFeature;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/StreamReadFeature;",
        ">;",
        "Lcom/fasterxml/jackson/core/util/JacksonFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum IGNORE_UNDEFINED:Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

.field public static final enum USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;


# instance fields
.field private final _defaultState:Z

.field private final _mappedFeature:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field private final _mask:I


# direct methods
.method static constructor <clinit>()V
    .registers 9

    .line 31
    new-instance v0, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v1, 0x0

    sget-object v2, Lcom/fasterxml/jackson/core/JsonParser$Feature;->AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v3, "AUTO_CLOSE_SOURCE"

    invoke-direct {v0, v3, v1, v2}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v0, Lcom/fasterxml/jackson/core/StreamReadFeature;->AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 49
    new-instance v1, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v2, 0x1

    sget-object v3, Lcom/fasterxml/jackson/core/JsonParser$Feature;->STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v4, "STRICT_DUPLICATE_DETECTION"

    invoke-direct {v1, v4, v2, v3}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 71
    new-instance v2, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v3, 0x2

    sget-object v4, Lcom/fasterxml/jackson/core/JsonParser$Feature;->IGNORE_UNDEFINED:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v5, "IGNORE_UNDEFINED"

    invoke-direct {v2, v5, v3, v4}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v2, Lcom/fasterxml/jackson/core/StreamReadFeature;->IGNORE_UNDEFINED:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 92
    new-instance v3, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v4, 0x3

    sget-object v5, Lcom/fasterxml/jackson/core/JsonParser$Feature;->INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v6, "INCLUDE_SOURCE_IN_LOCATION"

    invoke-direct {v3, v6, v4, v5}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v3, Lcom/fasterxml/jackson/core/StreamReadFeature;->INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 103
    new-instance v4, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v5, 0x4

    sget-object v6, Lcom/fasterxml/jackson/core/JsonParser$Feature;->USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v7, "USE_FAST_DOUBLE_PARSER"

    invoke-direct {v4, v7, v5, v6}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v4, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 114
    new-instance v5, Lcom/fasterxml/jackson/core/StreamReadFeature;

    const/4 v6, 0x5

    sget-object v7, Lcom/fasterxml/jackson/core/JsonParser$Feature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const-string v8, "USE_FAST_BIG_NUMBER_PARSER"

    invoke-direct {v5, v8, v6, v7}, Lcom/fasterxml/jackson/core/StreamReadFeature;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V

    sput-object v5, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 14
    filled-new-array/range {v0 .. v5}, [Lcom/fasterxml/jackson/core/StreamReadFeature;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/StreamReadFeature;->$VALUES:[Lcom/fasterxml/jackson/core/StreamReadFeature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonParser$Feature;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser$Feature;",
            ")V"
        }
    .end annotation

    .line 131
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 133
    iput-object p3, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_mappedFeature:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 134
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    move-result p1

    iput p1, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_mask:I

    .line 135
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledByDefault()Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_defaultState:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/StreamReadFeature;
    .registers 2

    .line 14
    const-class v0, Lcom/fasterxml/jackson/core/StreamReadFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/StreamReadFeature;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/StreamReadFeature;
    .registers 1

    .line 14
    sget-object v0, Lcom/fasterxml/jackson/core/StreamReadFeature;->$VALUES:[Lcom/fasterxml/jackson/core/StreamReadFeature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/StreamReadFeature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/StreamReadFeature;

    return-object v0
.end method


# virtual methods
.method public final enabledByDefault()Z
    .registers 1

    .line 156
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_defaultState:Z

    return p0
.end method

.method public final enabledIn(I)Z
    .registers 2

    .line 158
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_mask:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final getMask()I
    .registers 1

    .line 160
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_mask:I

    return p0
.end method

.method public final mappedFeature()Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .registers 1

    .line 162
    iget-object p0, p0, Lcom/fasterxml/jackson/core/StreamReadFeature;->_mappedFeature:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    return-object p0
.end method
