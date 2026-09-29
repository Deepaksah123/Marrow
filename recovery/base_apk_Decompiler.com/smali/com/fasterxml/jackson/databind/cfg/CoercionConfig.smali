###### Class com.fasterxml.jackson.databind.cfg.CoercionConfig (com.fasterxml.jackson.databind.cfg.CoercionConfig)
.class public Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final INPUT_SHAPE_COUNT:I


# instance fields
.field protected _acceptBlankAsEmpty:Ljava/lang/Boolean;

.field protected final _coercionsByShape:[Lcom/fasterxml/jackson/databind/cfg/CoercionAction;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 13
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->values()[Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    move-result-object v0

    array-length v0, v0

    sput v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->INPUT_SHAPE_COUNT:I

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->INPUT_SHAPE_COUNT:I

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->_coercionsByShape:[Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->_acceptBlankAsEmpty:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;
    .registers 2

    .line 37
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->_coercionsByShape:[Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget-object p0, p0, p1

    return-object p0
.end method

.method public getAcceptBlankAsEmpty()Ljava/lang/Boolean;
    .registers 1

    .line 41
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->_acceptBlankAsEmpty:Ljava/lang/Boolean;

    return-object p0
.end method
